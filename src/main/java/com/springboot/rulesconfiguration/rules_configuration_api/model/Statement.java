package com.springboot.rulesconfiguration.rules_configuration_api.model;

public class Statement {

    private Long id;
    private Condition condition;
    private String clause;

    public Long getId() {
        return id;
    }

    public Condition getCondition() {
        return condition;
    }

    public String getClause() {
        return clause;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }


    public void setClause(String clause) {
        this.clause = clause;
    }

    public Statement(Long id, Condition condition, String clause) {
        this.id = id;
        this.condition = condition;
        this.clause = clause;
    }

    public String fullString() {
        return condition + " " + clause;
    }

    @Override
    public String toString() {
        return "Statement{" +
                "id=" + id +
                ", condition=" + condition +
                ", clause='" + clause + '\'' +
                '}';
    }
}
