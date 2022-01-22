public class Document {

    private String number;
    private DocumentType documentType;

    public Document(String number, DocumentType documentType){
        switch (documentType){
            case RG: validateRg(number);
            case CPF: validateCpf(number);
        }

        this.documentType = documentType;
        this.number = number;
    }

    private void validateCpf(String cpf){
        if(cpf == null || !cpf.matches("/^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$/"))
            throw new IllegalArgumentException("CPF is not valid!");
    }

    private void validateRg(String rg){
        if(rg == null || !rg.matches("^[0-9]*$"))
            throw new IllegalArgumentException("RG is not valid!");
    }
}
