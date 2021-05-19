package com.springboot.rulesconfiguration.rules_configuration_api.model;

public enum Condition {
    IF("if"),
    THEN("then"),
    ELSE("else"),
    ELSE_IF("else if"),
    AND("and");

    String text;

    Condition(String text) {
        this.text = text;
    }

}
