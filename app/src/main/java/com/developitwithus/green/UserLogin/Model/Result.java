package com.developitwithus.green.UserLogin.Model;

public class Result<T>{

    private Result(){

    }


    public static final class Success<T> extends Result{
        private T entity;

        public Success(T entity) {
            this.entity = entity;
        }

        public T getEntity() {
            return entity;
        }
    }


    public static final class Error extends Result{
        private Exception error;

        public Error(Exception error) {
            this.error = error;
        }

        public Exception getError() {
            return error;
        }
    }


}
