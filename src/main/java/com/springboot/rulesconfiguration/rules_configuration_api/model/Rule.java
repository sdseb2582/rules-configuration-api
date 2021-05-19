package com.springboot.rulesconfiguration.rules_configuration_api.model;

import java.util.List;
import java.util.stream.Collectors;

/*
* class representing our conditional rule
* this class will have a set of ordered statements as a field
* which will be evaluated to imperative logic
* */
public class Rule {

    // simple id, would need to change to UUID later
    private Long id;
    // field for rules
    private List<Statement> statements;
    private String fullRule;

    // getters and setters

    public List<Statement> getStatements() {
        return statements;
    }

    public Long getId() {
        return id;
    }

    public String getFullRule() {
        return fullRule;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // constructor

    public Rule(Long id, List<Statement> statements) {
        this.id = id;
        this.statements = statements;


    }

    public void setFullRule() {
        fullRule = statements.stream()
                .map(Statement::fullString)
                .collect(Collectors.toList()).toString()
                    .replace("[", "")
                    .replace("]", "");
    }

    @Override
    public String toString() {
        return "Rule{" +
                "id=" + id +
                ", statements=" + statements +
                ", fullRule='" + fullRule + '\'' +
                '}';
    }
}
