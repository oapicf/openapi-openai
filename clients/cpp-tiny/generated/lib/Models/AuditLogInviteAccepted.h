
/*
 * AuditLog_invite_accepted.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_invite_accepted_H_
#define TINY_CPP_CLIENT_AuditLog_invite_accepted_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The details for events with this `type`.
 *
 *  \ingroup Models
 *
 */

class AuditLog_invite_accepted{
public:

    /*! \brief Constructor.
	 */
    AuditLog_invite_accepted();
    AuditLog_invite_accepted(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_invite_accepted();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the invite.
	 */
	std::string getId();

	/*! \brief Set The ID of the invite.
	 */
	void setId(std::string  id);


    private:
    std::string id{};
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_invite_accepted_H_ */
