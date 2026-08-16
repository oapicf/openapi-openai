
/*
 * AuditLog_project_created_data.h
 *
 * The payload used to create the project.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_project_created_data_H_
#define TINY_CPP_CLIENT_AuditLog_project_created_data_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The payload used to create the project.
 *
 *  \ingroup Models
 *
 */

class AuditLog_project_created_data{
public:

    /*! \brief Constructor.
	 */
    AuditLog_project_created_data();
    AuditLog_project_created_data(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_project_created_data();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The project name.
	 */
	std::string getName();

	/*! \brief Set The project name.
	 */
	void setName(std::string  name);
	/*! \brief Get The title of the project as seen on the dashboard.
	 */
	std::string getTitle();

	/*! \brief Set The title of the project as seen on the dashboard.
	 */
	void setTitle(std::string  title);


    private:
    std::string name{};
    std::string title{};
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_project_created_data_H_ */
