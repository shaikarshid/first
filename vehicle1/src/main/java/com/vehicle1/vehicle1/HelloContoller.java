package com.vehicle1.vehicle1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HelloContoller 
{
	@Autowired
	vehiclerepo repo;

	@RequestMapping("/form")
	String display()
	{
		return "web.jsp";

	}

	/** I N S E R T */
	@RequestMapping("/process")
	String save(Vehicle v)
	{
		repo.save(v);
		return "web.jsp";

	}


	/** getById the details... */
	@RequestMapping("/getById")
	String getById(int id,HttpSession h)
	{
		Vehicle vid = repo.findById(id).orElse(null);
		h.setAttribute("key", vid);
		return "web.jsp";
	}

	/** getByName the details... */
	@RequestMapping("/getByvName")
	String getByName(String vName,HttpSession h)
	{
		List<Vehicle> vname=repo.findByvName(vName);
		h.setAttribute("key1", vname);
		return "web.jsp";

	}
	@RequestMapping("/deleteById")
	String  delete(int id,HttpSession h)
	{
		Optional<Vehicle> deletedid = repo.findById(id);
		if(deletedid.isPresent())
		{
			repo.deleteById(id);
		}
		h.setAttribute("key2", deletedid);
		return "web.jsp";
	}

	@RequestMapping("/updateById")
	String update(int id, Vehicle v,HttpSession h)
	{
		Vehicle all =  repo.findById(id).orElse(null);

		all.setId(v.getId());
		all.setvName(v.getvName());
		all.setvColor(v.getvColor());
		all.setvNum(v.getvNum());
		repo.save(all);
		h.setAttribute("key5", all);
		return "web.jsp";

	}
	@RequestMapping("/getall")
	String  getall(HttpSession h)
	{
		Iterable<Vehicle> all = repo.findAll();
		h.setAttribute("all", all);
		return "web.jsp";


	}

}
