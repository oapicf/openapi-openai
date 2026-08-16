
/*
 * AdminApiKey_owner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdminApiKey_owner_H_
#define TINY_CPP_CLIENT_AdminApiKey_owner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdminApiKey_owner{
public:

    /*! \brief Constructor.
	 */
    AdminApiKey_owner();
    AdminApiKey_owner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdminApiKey_owner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getType();

	/*! \brief Set 
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	long getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(long  created_at);
	/*! \brief Get 
	 */
	std::string getRole();

	/*! \brief Set 
	 */
	void setRole(std::string  role);


    private:
    std::string type{};
    std::string id{};
    std::string name{};
    long created_at{};
    std::string role{};
};
}

#endif /* TINY_CPP_CLIENT_AdminApiKey_owner_H_ */
