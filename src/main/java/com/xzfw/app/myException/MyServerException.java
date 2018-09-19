package com.xzfw.app.myException;


/**
 * 自定义异常,server层异常
 */

public class MyServerException extends Exception {

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

    /**
     * 手机号码异常
     * @author 苏鹏翔
     */
    public static class phoneNumberException extends RuntimeException{

        private static final long serialVersionUID = -7044155411201180659L;

        public phoneNumberException(String message){
            super(message);
        }
    }
    /**
     * 用户名异常
     */
    public static class userException extends RuntimeException{

        private static final long serialVersionUID = 7738970485524440017L;

        public userException (String messge){
            super(messge);
        }
    }
    /**
     * 用户密码异常
     */
    public static class passWordException extends RuntimeException{

        private static final long serialVersionUID = -1704815637056470939L;

        public passWordException(String messge){
            super(messge);
        }
    }
    /**
     * 短信次数超出异常
     */
    public static class messageNumOutException extends RuntimeException{

        private static final long serialVersionUID = -8916226308118016769L;

        public messageNumOutException(String messge){
            super(messge);
        }
    }

    /**
     * 验证错误异常
     */
    public static class phoneCodeErrorException extends RuntimeException {

        private static final long serialVersionUID = -3638702188090070475L;

        public phoneCodeErrorException(String message) {
            super(message);
        }
    }

    /**
     * 注册时用户已经存在异常
     */
    public static class userExistException extends RuntimeException {

        private static final long serialVersionUID = -7814109098659411533L;

        public userExistException(String message){
            super(message);
        }
    }

    /**
     * 商品属性为空异常
     */
    public static class articleNullPointerException extends NullPointerException {

        private static final long serialVersionUID = 6791838797802087391L;

        public articleNullPointerException(String message){
            super(message);
        }
    }


}
