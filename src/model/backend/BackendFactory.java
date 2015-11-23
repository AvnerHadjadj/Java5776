package model.backend;

import model.datasource.Datasource;

/**
 * Created by MacBook on 15/11/15.
 */

public class BackendFactory {

    static Datasource data = null;

    public final static Datasource getInstance() {
        if (data == null)
            data = new model.datasource.Datasource();

        return data;
    }

    public final static Backend getBackend() {
        return new BackendImp();
    }
}
