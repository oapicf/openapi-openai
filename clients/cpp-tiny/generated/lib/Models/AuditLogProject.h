
/*
 * AuditLog_project.h
 *
 * The project that the action was scoped to. Absent for actions not scoped to projects.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_project_H_
#define TINY_CPP_CLIENT_AuditLog_project_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The project that the action was scoped to. Absent for actions not scoped to projects.
 *
 *  \ingroup Models
 *
 */

class AuditLog_project{
public:

    /*! \brief Constructor.
	 */
    AuditLog_project();
    AuditLog_project(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_project();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The project ID.
	 */
	std::string getId();

	/*! \brief Set The project ID.
	 */
	void setId(std::string  id);
	/*! \brief Get The project title.
	 */
	std::string getName();

	/*! \brief Set The project title.
	 */
	void setName(std::string  name);


    private:
    std::string id{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_project_H_ */
