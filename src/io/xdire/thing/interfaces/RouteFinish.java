package io.xdire.thing.interfaces;

import io.xdire.thing.ops.HttpRequest;
import io.xdire.thing.ops.HttpResponse;
import io.xdire.thing.ops.NextOperation;

/**
 * Created by xdire on 18.10.15.
 */
public interface RouteFinish {

    String execute(HttpRequest req,HttpResponse res,NextOperation next);

}
