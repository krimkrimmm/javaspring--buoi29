package vn.scrip.buoi29.repository;
import vn.scrip.buoi29.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ActorRepository extends JpaRepository<Actor, Integer> {
}