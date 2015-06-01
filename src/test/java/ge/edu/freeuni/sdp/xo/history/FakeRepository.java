package java.ge.edu.freeuni.sdp.xo.history;

import ge.edu.freeuni.sdp.xo.history.data.InMemoryRepository;
import ge.edu.freeuni.sdp.xo.history.data.Repository;
import ge.edu.freeuni.sdp.xo.history.data.TaskEntity;

import java.util.HashMap;
import java.util.Map;

public class FakeRepository extends InMemoryRepository implements Repository {

	private static FakeRepository instance;

	public static FakeRepository instance() {
		if (instance==null) {
			instance = new FakeRepository(new HashMap<String, TaskEntity>());
		}
		return instance;
	}

	
	public FakeRepository(Map<String, TaskEntity> map) {
		super(map);
	}
	
	public boolean contains(String id) {
		return map.containsKey(id);
	}
	
	public void clear() {
		this.map.clear();
	}
}
