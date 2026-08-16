
/*
 * AuditLog_user_updated_changes_requested.h
 *
 * The payload used to update the user.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_user_updated_changes_requested_H_
#define TINY_CPP_CLIENT_AuditLog_user_updated_changes_requested_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The payload used to update the user.
 *
 *  \ingroup Models
 *
 */

class AuditLog_user_updated_changes_requested{
public:

    /*! \brief Constructor.
	 */
    AuditLog_user_updated_changes_requested();
    AuditLog_user_updated_changes_requested(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_user_updated_changes_requested();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The role of the user. Is either `owner` or `member`.
	 */
	std::string getRole();

	/*! \brief Set The role of the user. Is either `owner` or `member`.
	 */
	void setRole(std::string  role);


    private:
    std::string role{};
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_user_updated_changes_requested_H_ */
