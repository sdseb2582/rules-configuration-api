package com.springboot.rulesconfiguration.rules_configuration_api.model;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RuleTest {

    List<Statement> statements;

    @Test
    public void ListTest() {

        statements = List.of(
                new Statement(1L, Condition.IF, "birds can fly"),
                new Statement(1L, Condition.THEN,"humans can fly too")
                );

        Rule rule = new Rule(1L, statements);
        rule.setFullRule();

        var expected = "IF birds can fly, THEN humans can fly too";
        var actual = rule.getFullRule();
        assertEquals(expected, actual);
    }

}