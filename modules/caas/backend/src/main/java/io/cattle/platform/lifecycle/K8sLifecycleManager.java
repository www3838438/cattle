package io.cattle.platform.lifecycle;

import io.cattle.platform.core.model.Instance;

public interface K8sLifecycleManager {

    void instanceCreate(Instance instance);

}
