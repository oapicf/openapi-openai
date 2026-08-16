
/*
 * AuditLog_invite_sent_data.h
 *
 * The payload used to create the invite.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_invite_sent_data_H_
#define TINY_CPP_CLIENT_AuditLog_invite_sent_data_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The payload used to create the invite.
 *
 *  \ingroup Models
 *
 */

class AuditLog_invite_sent_data{
public:

    /*! \brief Constructor.
	 */
    AuditLog_invite_sent_data();
    AuditLog_invite_sent_data(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_invite_sent_data();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The email invited to the organization.
	 */
	std::string getEmail();

	/*! \brief Set The email invited to the organization.
	 */
	void setEmail(std::string  email);
	/*! \brief Get The role the email was invited to be. Is either `owner` or `member`.
	 */
	std::string getRole();

	/*! \brief Set The role the email was invited to be. Is either `owner` or `member`.
	 */
	void setRole(std::string  role);


    private:
    std::string email{};
    std::string role{};
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_invite_sent_data_H_ */
