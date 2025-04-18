package base;

import io.restassured.response.Response;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import utils.AuthManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BaseTest {

    @BeforeClass
    public void setup() {
        AuthManager.loginUser();
    }

    protected static final Logger logger = LogManager.getLogger(BaseTest.class);
    protected Response response; // Assign this in each test

    @AfterMethod
    public void logAfterEachTest(ITestResult result) {
        String testName = result.getMethod().getMethodName();

        switch (result.getStatus()) {
            case ITestResult.SUCCESS:
                logger.info("✅ Test Passed: {}", testName);
                break;

            case ITestResult.FAILURE:
                logger.error("❌ Test Failed: {}", testName);
                logger.error("🛑 Reason: ", result.getThrowable());

                // Log response only if available
                if (response != null) {
                    logger.error("📦 Status Code: {}", response.getStatusCode());
                    logger.error("📄 Response Body:\n{}", response.getBody().prettyPrint());
                } else {
                    logger.warn("⚠️ Response was null, nothing to log.");
                }
                break;

            case ITestResult.SKIP:
                logger.warn("⚠️ Test Skipped: {}", testName);
                break;
        }
    }

    protected void logResponse(Response response) {
        if (response != null) {
            logger.info("📦 Status Code: {}", response.getStatusCode());
            logger.debug("📄 Response Body:\n{}", response.getBody());
        } else {
            logger.warn("⚠️ Tried to log a null response.");
        }
    }
}
