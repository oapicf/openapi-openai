
/*
 * BatchRequestOutput_error.h
 *
 * For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
 */

#ifndef TINY_CPP_CLIENT_BatchRequestOutput_error_H_
#define TINY_CPP_CLIENT_BatchRequestOutput_error_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
 *
 *  \ingroup Models
 *
 */

class BatchRequestOutput_error{
public:

    /*! \brief Constructor.
	 */
    BatchRequestOutput_error();
    BatchRequestOutput_error(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BatchRequestOutput_error();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A machine-readable error code.
	 */
	std::string getCode();

	/*! \brief Set A machine-readable error code.
	 */
	void setCode(std::string  code);
	/*! \brief Get A human-readable error message.
	 */
	std::string getMessage();

	/*! \brief Set A human-readable error message.
	 */
	void setMessage(std::string  message);


    private:
    std::string code{};
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_BatchRequestOutput_error_H_ */
