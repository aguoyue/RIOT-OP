//package in.dream_lab.bm.stream_iot.tasks.driver;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import in.dream_lab.bm.stream_iot.tasks.io.MQTTPublishTask;
//
//import java.util.Properties;
//
///**
// * Created by anshushukla on 27/05/16.
// */
//public class MQTTPublishTest extends MQTTPublishTask {
//
//
//    private static Logger l; // TODO: Ensure logger is initialized before use
//
//    /**
//     *
//     * @param l_
//     */
//    public static void initLogger(Logger l_) {
//        l = l_;
//    }
//
//    public static void main(String[] args) {
//
//
//        MQTTPublishTask l1=new MQTTPublishTask();
//
//        initLogger(LoggerFactory.getLogger("APP"));
//        Properties p_=new Properties();
//
//
//        l1.setup(l,p_ );
//        String dummyTuple="-71.106167,42.372802,-0.1,65.3,0,367.38,26";
//
//        for(int c=0;c<20;c++)
//        l.warn(String.valueOf(l1.doTask(dummyTuple)));
//
//        l.warn(String.valueOf(l1.tearDown()));
//    }
//
////    @Test
////    public void testPIValTest()
////    {
////
////
////        PiByViete l1=new PiByViete();
////        initLogger(LoggerFactory.getLogger("APP"));
////        Properties p_=new Properties();
////        l1.setup(l,p_ );
////        String dummyTuple="-71.106167,42.372802,-0.1,65.3,0,367.38,26";
////        Float piRes = l1.doTask(dummyTuple);
////        l.warn(String.valueOf(piRes));
////        l.warn(String.valueOf(l1.tearDown()));
////        Assert.assertTrue(piRes>0);
////    }
//
//}
//
