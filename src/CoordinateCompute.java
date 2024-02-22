package src;

import src.Interface.ComputeJobs;
import src.Interface.DataStoreAPI;
import src.Interface.ReadAndWrite;
import src.Interface.UserAPI;

public interface CoordinateCompute {
    //request from user to start computations with an inputPayload
    UserAPI inputPayload();

    //data storage takes in input for compute to do
    DataStoreAPI storeInputPayload();


    //passing payload to compute job
    ComputeJobs createJobFromInput();


    //write output for user from data storage
    ReadAndWrite outputResult();
}
