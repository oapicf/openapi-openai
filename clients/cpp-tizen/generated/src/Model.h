/*
 * Model.h
 *
 * 
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


/*! \brief 
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
	int getCreated();

	/*! \brief Set 
	 */
	void setCreated(int  created);
	/*! \brief Get 
	 */
	std::string getOwnedBy();

	/*! \brief Set 
	 */
	void setOwnedBy(std::string  owned_by);

private:
	std::string id;
	std::string object;
	int created;
	std::string owned_by;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Model_H_ */
