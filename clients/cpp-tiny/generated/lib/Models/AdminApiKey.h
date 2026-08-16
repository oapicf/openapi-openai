
/*
 * AdminApiKey.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdminApiKey_H_
#define TINY_CPP_CLIENT_AdminApiKey_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdminApiKey_owner.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdminApiKey{
public:

    /*! \brief Constructor.
	 */
    AdminApiKey();
    AdminApiKey(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdminApiKey();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
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
	std::string getRedactedValue();

	/*! \brief Set 
	 */
	void setRedactedValue(std::string  redacted_value);
	/*! \brief Get 
	 */
	std::string getValue();

	/*! \brief Set 
	 */
	void setValue(std::string  value);
	/*! \brief Get 
	 */
	long getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(long  created_at);
	/*! \brief Get 
	 */
	AdminApiKey_owner getOwner();

	/*! \brief Set 
	 */
	void setOwner(AdminApiKey_owner  owner);


    private:
    std::string object{};
    std::string id{};
    std::string name{};
    std::string redacted_value{};
    std::string value{};
    long created_at{};
    AdminApiKey_owner owner;
};
}

#endif /* TINY_CPP_CLIENT_AdminApiKey_H_ */
