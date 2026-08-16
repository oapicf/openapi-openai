
/*
 * Model.h
 *
 * Describes an OpenAI model offering that can be used with the API.
 */

#ifndef TINY_CPP_CLIENT_Model_H_
#define TINY_CPP_CLIENT_Model_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Describes an OpenAI model offering that can be used with the API.
 *
 *  \ingroup Models
 *
 */

class Model{
public:

    /*! \brief Constructor.
	 */
    Model();
    Model(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Model();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The model identifier, which can be referenced in the API endpoints.
	 */
	std::string getId();

	/*! \brief Set The model identifier, which can be referenced in the API endpoints.
	 */
	void setId(std::string  id);
	/*! \brief Get The Unix timestamp (in seconds) when the model was created.
	 */
	int getCreated();

	/*! \brief Set The Unix timestamp (in seconds) when the model was created.
	 */
	void setCreated(int  created);
	/*! \brief Get The object type, which is always \"model\".
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always \"model\".
	 */
	void setObject(std::string  object);
	/*! \brief Get The organization that owns the model.
	 */
	std::string getOwnedBy();

	/*! \brief Set The organization that owns the model.
	 */
	void setOwnedBy(std::string  owned_by);


    private:
    std::string id{};
    int created{};
    std::string object{};
    std::string owned_by{};
};
}

#endif /* TINY_CPP_CLIENT_Model_H_ */
