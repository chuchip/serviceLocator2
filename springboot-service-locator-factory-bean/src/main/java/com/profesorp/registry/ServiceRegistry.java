package com.profesorp.registry;

import com.profesorp.MotoService.AdapterService;

public interface ServiceRegistry {
	public AdapterService getService(String serviceName);
}
