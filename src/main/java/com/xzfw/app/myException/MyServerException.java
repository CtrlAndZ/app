package com.xzfw.app.myException;

/**
 * 自定义异常,server层异常
 */

public class MyServerException extends RuntimeException {

    private static final long serialVersionUID = 654396779051184632L;

    /**
     * 错误编码
     */
    private String message;

    private MyServerException(String message){
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    /**
     * 手机号码为空异常
     */
    public static class iphoneEmptyException extends RuntimeException {

        private static final long serialVersionUID = 7228934700000095034L;

        public iphoneEmptyException(String message) {
            super(message);
        }
    }

    /**
     * 密码为空异常
     */
    public static class passWordEmptyException extends RuntimeException {

        private static final long serialVersionUID = -4017401563623305876L;

        public passWordEmptyException(String message){
            super(message);
        }
    }

    /**
     * 用户不存在异常
     */
    public static class userNotException extends RuntimeException {

        private static final long serialVersionUID = -5968020170492486460L;

        public userNotException(String message){
            super(message);
        }
    }

    /**
     * 密码不正确异常
     */
    public static class passWordWrongException extends RuntimeException{

        private static final long serialVersionUID = 3752266314709451884L;

        public passWordWrongException(String message){
            super(message);
        }
    }



}
