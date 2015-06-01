package ge.edu.freeuni.sdp.xo.history.core;


import javax.ws.rs.Path;

import ge.edu.freeuni.sdp.xo.history.data.InMemoryRepository;
import ge.edu.freeuni.sdp.xo.history.data.Repository;

import com.microsoft.azure.storage.StorageException;

@Path("memtodos")
public class InMemoryTaskService extends TaskService {
	
	@Override
	public Repository getRepository() throws StorageException {
		return InMemoryRepository.instance();
	}

}
