package org.home.GetPersonService;

import org.slf4j.*;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ErrorPersonController {
    private static Logger logger = LoggerFactory.getLogger(ErrorPersonController.class);
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ErrorInfo processException(Exception e) {
        logger.error("Unexpected error", e);
        return new ErrorInfo(e.getMessage());
    }
}
