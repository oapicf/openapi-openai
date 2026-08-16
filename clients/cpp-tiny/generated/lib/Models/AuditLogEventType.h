
/*
 * AuditLogEventType.h
 *
 * The event type.
 */

#ifndef TINY_CPP_CLIENT_AuditLogEventType_H_
#define TINY_CPP_CLIENT_AuditLogEventType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The event type.
 *
 *  \ingroup Models
 *
 */

class AuditLogEventType{
public:

    /*! \brief Constructor.
	 */
    AuditLogEventType();
    AuditLogEventType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLogEventType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AuditLogEventType_H_ */
