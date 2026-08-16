
/*
 * AuditLog_project_archived.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_project_archived_H_
#define TINY_CPP_CLIENT_AuditLog_project_archived_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The details for events with this `type`.
 *
 *  \ingroup Models
 *
 */

class AuditLog_project_archived{
public:

    /*! \brief Constructor.
	 */
    AuditLog_project_archived();
    AuditLog_project_archived(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_project_archived();


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


    private:
    std::string id{};
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_project_archived_H_ */
