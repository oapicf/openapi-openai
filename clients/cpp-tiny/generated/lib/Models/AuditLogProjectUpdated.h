
/*
 * AuditLog_project_updated.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_project_updated_H_
#define TINY_CPP_CLIENT_AuditLog_project_updated_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AuditLog_project_updated_changes_requested.h"

namespace Tiny {


/*! \brief The details for events with this `type`.
 *
 *  \ingroup Models
 *
 */

class AuditLog_project_updated{
public:

    /*! \brief Constructor.
	 */
    AuditLog_project_updated();
    AuditLog_project_updated(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_project_updated();


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
	AuditLog_project_updated_changes_requested getChangesRequested();

	/*! \brief Set 
	 */
	void setChangesRequested(AuditLog_project_updated_changes_requested  changes_requested);


    private:
    std::string id{};
    AuditLog_project_updated_changes_requested changes_requested;
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_project_updated_H_ */
