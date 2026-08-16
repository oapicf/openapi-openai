
/*
 * ErrorResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ErrorResponse_H_
#define TINY_CPP_CLIENT_ErrorResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Error.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ErrorResponse{
public:

    /*! \brief Constructor.
	 */
    ErrorResponse();
    ErrorResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ErrorResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Error getError();

	/*! \brief Set 
	 */
	void setError(Error  error);


    private:
    Error error;
};
}

#endif /* TINY_CPP_CLIENT_ErrorResponse_H_ */
