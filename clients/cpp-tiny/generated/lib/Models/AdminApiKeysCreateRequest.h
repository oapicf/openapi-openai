
/*
 * Admin_api_keys_create_request.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Admin_api_keys_create_request_H_
#define TINY_CPP_CLIENT_Admin_api_keys_create_request_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Admin_api_keys_create_request{
public:

    /*! \brief Constructor.
	 */
    Admin_api_keys_create_request();
    Admin_api_keys_create_request(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Admin_api_keys_create_request();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);


    private:
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_Admin_api_keys_create_request_H_ */
