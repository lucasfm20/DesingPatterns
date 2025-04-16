package org.example.exercicio1;

public class DataAdapter extends DataLocal {
    private DataExterna dataExterna;

    public DataAdapter(DataExterna dataExterna) {
        super(converterParaLocal(dataExterna.getData()));
        this.dataExterna = dataExterna;
    }

    private static String converterParaLocal(String dataISO) {
        // Divide a string "YYYY-MM-DD" e reordena para "DD/MM/YYYY"
        String[] partes = dataISO.split("-");
        return partes[2] + "/" + partes[1] + "/" + partes[0];
    }
}