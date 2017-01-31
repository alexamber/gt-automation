package rest;

import org.apache.http.client.utils.URIBuilder;

/**
 * Created by AMBER on 29.01.2017.
 */
public abstract class CommonClient {
    protected String del = "/";

    protected abstract URIBuilder uriBuilder();

    protected String buildPath(String... paths) {
        return del+ String.join(del, paths);
    }
}
