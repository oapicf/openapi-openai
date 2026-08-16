
/*
 * RunStepObject_last_error.h
 *
 * The last error associated with this run step. Will be &#x60;null&#x60; if there are no errors.
 */

#ifndef TINY_CPP_CLIENT_RunStepObject_last_error_H_
#define TINY_CPP_CLIENT_RunStepObject_last_error_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The last error associated with this run step. Will be `null` if there are no errors.
 *
 *  \ingroup Models
 *
 */

class RunStepObject_last_error{
public:

    /*! \brief Constructor.
	 */
    RunStepObject_last_error();
    RunStepObject_last_error(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepObject_last_error();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get One of `server_error` or `rate_limit_exceeded`.
	 */
	std::string getCode();

	/*! \brief Set One of `server_error` or `rate_limit_exceeded`.
	 */
	void setCode(std::string  code);
	/*! \brief Get A human-readable description of the error.
	 */
	std::string getMessage();

	/*! \brief Set A human-readable description of the error.
	 */
	void setMessage(std::string  message);


    private:
    std::string code{};
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_RunStepObject_last_error_H_ */
