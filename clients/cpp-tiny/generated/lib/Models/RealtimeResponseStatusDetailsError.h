
/*
 * RealtimeResponse_status_details_error.h
 *
 * A description of the error that caused the response to fail,  populated when the &#x60;status&#x60; is &#x60;failed&#x60;. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeResponse_status_details_error_H_
#define TINY_CPP_CLIENT_RealtimeResponse_status_details_error_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief A description of the error that caused the response to fail,  populated when the `status` is `failed`. 
 *
 *  \ingroup Models
 *
 */

class RealtimeResponse_status_details_error{
public:

    /*! \brief Constructor.
	 */
    RealtimeResponse_status_details_error();
    RealtimeResponse_status_details_error(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeResponse_status_details_error();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of error.
	 */
	std::string getType();

	/*! \brief Set The type of error.
	 */
	void setType(std::string  type);
	/*! \brief Get Error code, if any.
	 */
	std::string getCode();

	/*! \brief Set Error code, if any.
	 */
	void setCode(std::string  code);


    private:
    std::string type{};
    std::string code{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeResponse_status_details_error_H_ */
