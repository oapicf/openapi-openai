
/*
 * AuditLogActorUser.h
 *
 * The user who performed the audit logged action.
 */

#ifndef TINY_CPP_CLIENT_AuditLogActorUser_H_
#define TINY_CPP_CLIENT_AuditLogActorUser_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The user who performed the audit logged action.
 *
 *  \ingroup Models
 *
 */

class AuditLogActorUser{
public:

    /*! \brief Constructor.
	 */
    AuditLogActorUser();
    AuditLogActorUser(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLogActorUser();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The user id.
	 */
	std::string getId();

	/*! \brief Set The user id.
	 */
	void setId(std::string  id);
	/*! \brief Get The user email.
	 */
	std::string getEmail();

	/*! \brief Set The user email.
	 */
	void setEmail(std::string  email);


    private:
    std::string id{};
    std::string email{};
};
}

#endif /* TINY_CPP_CLIENT_AuditLogActorUser_H_ */
