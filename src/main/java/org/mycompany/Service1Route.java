package org.mycompany;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import org.apache.camel.zipkin.ZipkinTracer; 


//@Component
public class Service1Route { // extends RouteBuilder {

   // @Override
   // public void configure() throws Exception {
    	
    	
    	/*ZipkinTracer zipkin = new ZipkinTracer();
        zipkin.setEndpoint("http://localhost:9411/api/v2/spans");
        // set the service name
        zipkin.setServiceName("service1");
        // capture 100% of all the events
        zipkin.setRate(1.0f);
        // include message bodies in the traces (not recommended for production)
        zipkin.setIncludeMessageBodyStreams(true);

        // add zipkin to CamelContext
        System.out.println("CONTEXT=======" + getContext().toString()); 
        zipkin.init(getContext()); 
        */
        
/*        from("jetty:http://0.0.0.0:{{service1.port}}/service1").routeId("service1").streamCaching() 
            .removeHeaders("CamelHttp*")
            .log("Service1 request: ${body}")
            .delay(simple("${random(1000,2000)}"))
            .transform(simple("Service1-${body}"))
            //.to("http://0.0.0.0:{{service2.port}}/service2")
            .log("Service1 response: ${body}");
        */
       
       /* from("jetty:http://0.0.0.0:{{service2.port}}/service1").routeId("service2").streamCaching() 
        .removeHeaders("CamelHttp*")
        .log("Service2 request: ${body}")
        .delay(simple("${random(1000,2000)}"))
        .transform(simple("Service2-${body}"))
        //.to("http://0.0.0.0:{{service2.port}}/service2")
        .log("Service2 response: ${body}");
    */
        
  //  }

} 