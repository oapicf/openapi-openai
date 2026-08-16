
/*
 * Admin_api_keys_delete_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Admin_api_keys_delete_200_response_H_
#define TINY_CPP_CLIENT_Admin_api_keys_delete_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Admin_api_keys_delete_200_response{
public:

    /*! \brief Constructor.
	 */
    Admin_api_keys_delete_200_response();
    Admin_api_keys_delete_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Admin_api_keys_delete_200_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	bool isDeleted();

	/*! \brief Set 
	 */
	void setDeleted(bool  deleted);


    private:
    std::string id{};
    std::string object{};
    bool deleted{};
};
}

#endif /* TINY_CPP_CLIENT_Admin_api_keys_delete_200_response_H_ */
