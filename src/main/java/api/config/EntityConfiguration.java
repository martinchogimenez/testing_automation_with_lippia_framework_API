package api.config;

import services.DelService;
import services.GetService;
import services.PostService;
import services.PutService;

public enum EntityConfiguration {

/*
Here I call the corresponding service according to the 
mentioned entity 
*/

    GETHOUR {
        @Override
        public Class<?> getEntityService() { return GetService.class; }
    },
    POSTHOUR {
        @Override
        public Class<?> getEntityService() { return PostService.class; }
    },
    PUTHOUR {
        @Override
        public Class<?> getEntityService() { return PutService.class; }
    },
    DELHOUR {
        @Override
        public Class<?> getEntityService() { return DelService.class; }
    };

    public abstract Class<?> getEntityService();
}



