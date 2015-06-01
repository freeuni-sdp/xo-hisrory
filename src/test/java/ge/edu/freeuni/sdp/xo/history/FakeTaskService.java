package java.ge.edu.freeuni.sdp.xo.history;

import com.microsoft.azure.storage.StorageException;

import ge.edu.freeuni.sdp.xo.history.core.TaskService;
import ge.edu.freeuni.sdp.xo.history.data.Repository;


public class FakeTaskService extends TaskService {
	@Override
	public Repository getRepository() throws StorageException {
		return FakeRepository.instance();
	}
}
