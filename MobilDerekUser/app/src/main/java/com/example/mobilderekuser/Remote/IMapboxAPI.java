package com.example.mobilderekuser.Remote;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IMapboxAPI {

    @GET("directions/v5/mapbox")
    Observable<String> getDirection(
            @Query("mode") String mode,
            @Query("transit_routing_preference") String transit_routing,
            @Query("origin") String from,
            @Query("destination") String to,
            @Query("key") String key
    );

}
