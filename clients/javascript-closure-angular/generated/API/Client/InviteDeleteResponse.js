goog.provide('API.Client.InviteDeleteResponse');

/**
 * @record
 */
API.Client.InviteDeleteResponse = function() {}

/**
 * The object type, which is always `organization.invite.deleted`
 * @type {!string}
 * @export
 */
API.Client.InviteDeleteResponse.prototype.object;

/**
 * @type {!string}
 * @export
 */
API.Client.InviteDeleteResponse.prototype.id;

/**
 * @type {!boolean}
 * @export
 */
API.Client.InviteDeleteResponse.prototype.deleted;

/** @enum {string} */
API.Client.InviteDeleteResponse.ObjectEnum = { 
  organization.invite.deleted: 'organization.invite.deleted',
}
