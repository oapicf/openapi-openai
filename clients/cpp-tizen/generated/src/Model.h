/*
 * Model.h
 *
 * Describes an OpenAI model offering that can be used with the API.
 */

#ifndef _Model_H_
#define _Model_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Describes an OpenAI model offering that can be used with the API.
 *
 *  \ingroup Models
 *
 */

class Model : public Object {
public:
	/*! \brief Constructor.
	 */
	Model();
	Model(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Model();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string id;
	int created;
	std::string object;
	std::string owned_by;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Model_H_ */
