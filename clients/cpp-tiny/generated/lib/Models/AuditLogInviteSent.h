
/*
 * AuditLog_invite_sent.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_invite_sent_H_
#define TINY_CPP_CLIENT_AuditLog_invite_sent_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AuditLog_invite_sent_data.h"

namespace Tiny {


/*! \brief The details for events with this `type`.
 *
 *  \ingroup Models
 *
 */

class AuditLog_invite_sent{
public:

    /*! \brief Constructor.
	 */
    AuditLog_invite_sent();
    AuditLog_invite_sent(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_invite_sent();


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
	/*! \brief Get 
	 */
	AuditLog_invite_sent_data getData();

	/*! \brief Set 
	 */
	void setData(AuditLog_invite_sent_data  data);


    private:
    std::string id{};
    AuditLog_invite_sent_data data;
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_invite_sent_H_ */
