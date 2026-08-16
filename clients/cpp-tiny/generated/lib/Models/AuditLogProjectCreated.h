
/*
 * AuditLog_project_created.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_project_created_H_
#define TINY_CPP_CLIENT_AuditLog_project_created_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AuditLog_project_created_data.h"

namespace Tiny {


/*! \brief The details for events with this `type`.
 *
 *  \ingroup Models
 *
 */

class AuditLog_project_created{
public:

    /*! \brief Constructor.
	 */
    AuditLog_project_created();
    AuditLog_project_created(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_project_created();


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
	/*! \brief Get 
	 */
	AuditLog_project_created_data getData();

	/*! \brief Set 
	 */
	void setData(AuditLog_project_created_data  data);


    private:
    std::string id{};
    AuditLog_project_created_data data;
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_project_created_H_ */
