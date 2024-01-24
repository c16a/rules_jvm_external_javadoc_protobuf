package sample;

import schemas.Request;

public class Main {
    public static void main(String[] args) {
        var request = Request.newBuilder().setBody("Steve").build();
    }
}