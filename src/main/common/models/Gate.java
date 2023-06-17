package main.common.models;

public abstract class Gate extends BaseModel{

    private int gateNumber;
    private GateType type;
    private Operator operator;
    private GateStatus gateStatus;

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void setType(GateType type) {
        this.type = type;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public Operator getOperator() {
        return operator;
    }

    public GateType getType() {
        return type;
    }
}
