
/*
 * ErrorEvent.h
 *
 * Occurs when an [error](/docs/guides/error-codes#api-errors) occurs. This can happen due to an internal server error or a timeout.
 */

#ifndef TINY_CPP_CLIENT_ErrorEvent_H_
#define TINY_CPP_CLIENT_ErrorEvent_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Error.h"

namespace Tiny {


/*! \brief Occurs when an [error](/docs/guides/error-codes#api-errors) occurs. This can happen due to an internal server error or a timeout.
 *
 *  \ingroup Models
 *
 */

class ErrorEvent{
public:

    /*! \brief Constructor.
	 */
    ErrorEvent();
    ErrorEvent(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ErrorEvent();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getEvent();

	/*! \brief Set 
	 */
	void setEvent(std::string  event);
	/*! \brief Get 
	 */
	Error getData();

	/*! \brief Set 
	 */
	void setData(Error  data);


    private:
    std::string event{};
    Error data;
};
}

#endif /* TINY_CPP_CLIENT_ErrorEvent_H_ */
