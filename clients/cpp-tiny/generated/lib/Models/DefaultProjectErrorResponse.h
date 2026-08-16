
/*
 * DefaultProjectErrorResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DefaultProjectErrorResponse_H_
#define TINY_CPP_CLIENT_DefaultProjectErrorResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DefaultProjectErrorResponse{
public:

    /*! \brief Constructor.
	 */
    DefaultProjectErrorResponse();
    DefaultProjectErrorResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DefaultProjectErrorResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getCode();

	/*! \brief Set 
	 */
	void setCode(int  code);
	/*! \brief Get 
	 */
	std::string getMessage();

	/*! \brief Set 
	 */
	void setMessage(std::string  message);


    private:
    int code{};
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_DefaultProjectErrorResponse_H_ */
