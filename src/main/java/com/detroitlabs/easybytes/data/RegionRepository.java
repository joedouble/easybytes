package com.detroitlabs.easybytes.data;

import com.detroitlabs.easybytes.model.Recipe;
import com.detroitlabs.easybytes.model.Region;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RegionRepository {
    private String regionName;
    private static final List<Region> All_Regions= Arrays.asList(
            new Region("Thailand"),
            new Region("Japan"),
            new Region("America"),
            new Region("China"),
            new Region("Portugal"),
            new Region("Spain")
    );

    public List<Region> getAll_Regions() {
        return All_Regions;
    }

    public Region findbyRegion(String region1){
        for(Region region : All_Regions) {
            if(region.getRegion().equalsIgnoreCase(region1)){
                return region;
            }
        }
        return null;
    }
}
