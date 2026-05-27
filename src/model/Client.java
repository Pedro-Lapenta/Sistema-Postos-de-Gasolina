package model;

/**
 * Entidade Client
 */
public class Client {

    private String clientId;
    private String gasStationId;
    private String name;
    private String cpf;

    public Client(String clientId, String gasStationId, String name, String cpf) {
        this.clientId      = clientId;
        this.gasStationId  = gasStationId;
        this.name          = name;
        this.cpf           = cpf;
    }

    public Client() {}

    public String getClientId() { return clientId; }
    public void setClientId(String clientId) { this.clientId = clientId; }

    public String getGasStationId() { return gasStationId; }
    public void setGasStationId(String gasStationId) { this.gasStationId = gasStationId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
}
